package com.dicoding.habitapp.ui.random;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0018\u0019B\u0019\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\u0002\u0010\u0007J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016J\u001c\u0010\u000f\u001a\u00020\u00062\n\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\rH\u0016J\u0016\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0005R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/dicoding/habitapp/ui/random/RandomHabitAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/dicoding/habitapp/ui/random/RandomHabitAdapter$PagerViewHolder;", "onClick", "Lkotlin/Function1;", "Lcom/dicoding/habitapp/data/Habit;", "", "(Lkotlin/jvm/functions/Function1;)V", "habitMap", "Ljava/util/LinkedHashMap;", "Lcom/dicoding/habitapp/ui/random/RandomHabitAdapter$PageType;", "getIndexKey", "position", "", "getItemCount", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "submitData", "key", "habit", "PageType", "PagerViewHolder", "app_debug"})
public final class RandomHabitAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.dicoding.habitapp.ui.random.RandomHabitAdapter.PagerViewHolder> {
    private final kotlin.jvm.functions.Function1<com.dicoding.habitapp.data.Habit, kotlin.Unit> onClick = null;
    private final java.util.LinkedHashMap<com.dicoding.habitapp.ui.random.RandomHabitAdapter.PageType, com.dicoding.habitapp.data.Habit> habitMap = null;
    
    public RandomHabitAdapter(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.dicoding.habitapp.data.Habit, kotlin.Unit> onClick) {
        super();
    }
    
    public final void submitData(@org.jetbrains.annotations.NotNull
    com.dicoding.habitapp.ui.random.RandomHabitAdapter.PageType key, @org.jetbrains.annotations.NotNull
    com.dicoding.habitapp.data.Habit habit) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.dicoding.habitapp.ui.random.RandomHabitAdapter.PagerViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.dicoding.habitapp.ui.random.RandomHabitAdapter.PagerViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    private final com.dicoding.habitapp.ui.random.RandomHabitAdapter.PageType getIndexKey(int position) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/dicoding/habitapp/ui/random/RandomHabitAdapter$PageType;", "", "(Ljava/lang/String;I)V", "HIGH", "MEDIUM", "LOW", "app_debug"})
    public static enum PageType {
        /*public static final*/ HIGH /* = new HIGH() */,
        /*public static final*/ MEDIUM /* = new MEDIUM() */,
        /*public static final*/ LOW /* = new LOW() */;
        
        PageType() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/dicoding/habitapp/ui/random/RandomHabitAdapter$PagerViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/dicoding/habitapp/ui/random/RandomHabitAdapter;Landroid/view/View;)V", "btnStartCountDown", "Landroid/widget/Button;", "ivPriority", "Landroid/widget/ImageView;", "tvMinutes", "Landroid/widget/TextView;", "tvStartTime", "tvTitle", "bind", "", "pageType", "Lcom/dicoding/habitapp/ui/random/RandomHabitAdapter$PageType;", "pageData", "Lcom/dicoding/habitapp/data/Habit;", "app_debug"})
    public final class PagerViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.widget.TextView tvTitle = null;
        private final android.widget.ImageView ivPriority = null;
        private final android.widget.TextView tvStartTime = null;
        private final android.widget.TextView tvMinutes = null;
        private final android.widget.Button btnStartCountDown = null;
        
        public PagerViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View itemView) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.dicoding.habitapp.ui.random.RandomHabitAdapter.PageType pageType, @org.jetbrains.annotations.NotNull
        com.dicoding.habitapp.data.Habit pageData) {
        }
    }
}