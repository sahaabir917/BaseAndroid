package com.gmpire.guruklub.util

import com.github.mikephil.charting.formatter.ValueFormatter

class ChartValueFormatter: ValueFormatter() {
    override fun getFormattedValue(value: Float): String {
        return "" + value.toInt() +"%"
    }
}