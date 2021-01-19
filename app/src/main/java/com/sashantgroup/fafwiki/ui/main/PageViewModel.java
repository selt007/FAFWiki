package com.sashantgroup.fafwiki.ui.main;

import android.widget.LinearLayout;

import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;

import com.sashantgroup.fafwiki.MainActivity;
import com.sashantgroup.fafwiki.units.Unit;

public class PageViewModel extends ViewModel {

    private MutableLiveData<Integer> mIndex = new MutableLiveData<>();
    private LiveData<String> mText = Transformations.map(mIndex, new Function<Integer, String>() {
        @Override
        public String apply(Integer input) {
            return "Section: " + input;
        }
    });
    private LiveData<Unit> unit = Transformations.map(mIndex, new Function<Integer, Unit>() {
        @Override
        public Unit apply(Integer input) {
            return MainActivity.tabContentList.get(input - 1);
        }
    });

    public void setIndex(int index) {
        mIndex.setValue(index);
    }

    public LiveData<String> getText() {
        return mText;
    }
    public LiveData<Unit> getLL() { return unit; }
}