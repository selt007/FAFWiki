package com.sashantgroup.fafwiki;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialogFragment;

public class DialogFragment extends AppCompatDialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        String message = MainActivity.mapMain.get("about");

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setMessage(message)
                .setCancelable(true)
                .setNegativeButton(Html.fromHtml("<font color='#FF7F27'>Bug report (Discord)</font>"),
                        (dialog, id) -> {
                            Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                                    Uri.parse("https://discord.gg/8gQVk4bzDH"));
                            startActivity(browserIntent);
                        })
                .setPositiveButton(Html.fromHtml("<font color='#FF7F27'>Donate</font>"),
                        (dialog, id) -> {
                            Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                                    Uri.parse("https://www.donationalerts.com/r/sashflacko"));
                            startActivity(browserIntent);
                        })
                .setNeutralButton(Html.fromHtml("<font color='#FF7F27'>Close</font>"),
                        (dialog, id) -> dialog.cancel());

        return builder.create();
    }
}
