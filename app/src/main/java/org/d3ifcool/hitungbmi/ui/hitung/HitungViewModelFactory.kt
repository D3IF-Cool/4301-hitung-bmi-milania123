package org.d3ifcool.hitungbmi.ui.hitung

import BmiDao
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class HitungViewModelFactory(
    private val db: BmiDao
) : ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(HitungViewModel::class.java)) {
            return HitungViewModel(db) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
