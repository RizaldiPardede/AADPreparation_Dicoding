package com.dicoding.habitapp.ui.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fJ\u000e\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0007J\u000e\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011\u00a8\u0006\u001c"}, d2 = {"Lcom/dicoding/habitapp/ui/list/HabitListViewModel;", "Landroidx/lifecycle/ViewModel;", "habitRepository", "Lcom/dicoding/habitapp/data/HabitRepository;", "(Lcom/dicoding/habitapp/data/HabitRepository;)V", "_filter", "Landroidx/lifecycle/MutableLiveData;", "Lcom/dicoding/habitapp/utils/HabitSortType;", "_snackbarText", "Lcom/dicoding/habitapp/utils/Event;", "", "_undo", "Lcom/dicoding/habitapp/data/Habit;", "habits", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagedList;", "getHabits", "()Landroidx/lifecycle/LiveData;", "snackbarText", "getSnackbarText", "undo", "getUndo", "deleteHabit", "", "habit", "filter", "filterType", "insert", "app_debug"})
public final class HabitListViewModel extends androidx.lifecycle.ViewModel {
    private final com.dicoding.habitapp.data.HabitRepository habitRepository = null;
    private final androidx.lifecycle.MutableLiveData<com.dicoding.habitapp.utils.HabitSortType> _filter = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<androidx.paging.PagedList<com.dicoding.habitapp.data.Habit>> habits = null;
    private final androidx.lifecycle.MutableLiveData<com.dicoding.habitapp.utils.Event<java.lang.Integer>> _snackbarText = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.dicoding.habitapp.utils.Event<java.lang.Integer>> snackbarText = null;
    private final androidx.lifecycle.MutableLiveData<com.dicoding.habitapp.utils.Event<com.dicoding.habitapp.data.Habit>> _undo = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.dicoding.habitapp.utils.Event<com.dicoding.habitapp.data.Habit>> undo = null;
    
    public HabitListViewModel(@org.jetbrains.annotations.NotNull
    com.dicoding.habitapp.data.HabitRepository habitRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<androidx.paging.PagedList<com.dicoding.habitapp.data.Habit>> getHabits() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.dicoding.habitapp.utils.Event<java.lang.Integer>> getSnackbarText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.dicoding.habitapp.utils.Event<com.dicoding.habitapp.data.Habit>> getUndo() {
        return null;
    }
    
    public final void filter(@org.jetbrains.annotations.NotNull
    com.dicoding.habitapp.utils.HabitSortType filterType) {
    }
    
    public final void deleteHabit(@org.jetbrains.annotations.NotNull
    com.dicoding.habitapp.data.Habit habit) {
    }
    
    public final void insert(@org.jetbrains.annotations.NotNull
    com.dicoding.habitapp.data.Habit habit) {
    }
}