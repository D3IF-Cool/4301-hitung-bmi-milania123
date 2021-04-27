package org.d3ifcool.hitungbmi.ui.histori

import BmiDao
import androidx.lifecycle.ViewModel

class HistoriViewModel(db: BmiDao) : ViewModel() {
    val data = db.getLastBmi()
}