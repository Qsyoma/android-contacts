package ru.yandex.practicum.contacts.presentation.base;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;

public class BaseListDiffCallback<T extends ListDiffInterface<T>> extends DiffUtil.ItemCallback<T>{

    @Override
    public boolean areItemsTheSame(@NonNull T oldItem, @NonNull T newItem) {
        ListDiffInterface n = new ListDiffInterface() {
            @Override
            public boolean theSameAs(Object o) {
                return false;
            }
        };
        return false;
    }

    @Override
    public boolean areContentsTheSame(@NonNull T oldItem, @NonNull T newItem) {
        return false;
    }
}
