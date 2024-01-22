package com.example.mymail.ui.outbox;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class OutboxViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public OutboxViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is outbox fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}