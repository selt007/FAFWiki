package com.sashantgroup.fafwiki.ui.main;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.sashantgroup.fafwiki.R;
import com.sashantgroup.fafwiki.UnitDataView;
import com.sashantgroup.fafwiki.UnitInfoActivity;
import com.sashantgroup.fafwiki.UnitsDrawActivity;
import com.sashantgroup.fafwiki.units.Unit;

import java.io.IOException;
import java.io.InputStream;

/**
 * A placeholder fragment containing a simple view.
 */
public class PlaceholderFragment extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";

    private PageViewModel pageViewModel;

    public static PlaceholderFragment newInstance(int index) {
        PlaceholderFragment fragment = new PlaceholderFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(ARG_SECTION_NUMBER, index);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pageViewModel = new ViewModelProvider(this).get(PageViewModel.class);
        int index = 1;
        if (getArguments() != null) {
            index = getArguments().getInt(ARG_SECTION_NUMBER);
        }
        pageViewModel.setIndex(index);
    }

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_compare, container, false);
        LinearLayout linearLayout3 = root.findViewById(R.id.linearLayout4);
        ImageView view = root.findViewById(R.id.imageView4);
        TextView textMainInfo = root.findViewById(R.id.textMainInfo4);
        Context context = root.getContext();

        pageViewModel.getLL().observe(this, new Observer<Unit>() {
            @Override
            public void onChanged(Unit unit) {
                InputStream inputStream;
                try {
                    String imgBG = "preview_background/" + unit.getGeneral().getIcon().name().toLowerCase() + "_up.png";
                    String imgUnit = "preview/" + unit.getID() + ".png";

                    inputStream = context.getApplicationContext().getAssets().open(imgBG);
                    Bitmap bmBG = BitmapFactory.decodeStream(inputStream);
                    inputStream = context.getApplicationContext().getAssets().open(imgUnit);
                    Bitmap bmUnit = BitmapFactory.decodeStream(inputStream);
                    view.setImageBitmap(UnitDataView.overlayBitmapToCenter(bmBG, bmUnit));
                }
                catch(Exception ignored) {
                    try {
                        inputStream = context.getApplicationContext().getAssets().open("icons/error.png");
                        Bitmap bmBG = BitmapFactory.decodeStream(inputStream);
                        view.setImageBitmap(bmBG);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                UnitDataView udv = new UnitDataView(unit, context);
                udv.displayAllInfo(linearLayout3, textMainInfo);
            }
        });
        return root;
    }
}