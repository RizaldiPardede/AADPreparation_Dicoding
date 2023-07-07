package com.dicoding.habitapp.ui.countdown;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0014J\u0006\u0010\u0015\u001a\u00020\u0014J\u000e\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0007J\u0006\u0010\u0018\u001a\u00020\u0014R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\b\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/dicoding/habitapp/ui/countdown/CountDownViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_eventCountDownFinish", "Landroidx/lifecycle/MutableLiveData;", "", "currentTime", "", "currentTimeString", "Landroidx/lifecycle/LiveData;", "", "kotlin.jvm.PlatformType", "getCurrentTimeString", "()Landroidx/lifecycle/LiveData;", "eventCountDownFinish", "getEventCountDownFinish", "initialTime", "timer", "Landroid/os/CountDownTimer;", "onCleared", "", "resetTimer", "setInitialTime", "minuteFocus", "startTimer", "app_debug"})
public final class CountDownViewModel extends androidx.lifecycle.ViewModel {
    private android.os.CountDownTimer timer;
    private final androidx.lifecycle.MutableLiveData<java.lang.Long> initialTime = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Long> currentTime = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.lang.String> currentTimeString = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _eventCountDownFinish = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.lang.Boolean> eventCountDownFinish = null;
    
    public CountDownViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.String> getCurrentTimeString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getEventCountDownFinish() {
        return null;
    }
    
    public final void setInitialTime(long minuteFocus) {
    }
    
    public final void startTimer() {
    }
    
    public final void resetTimer() {
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
}