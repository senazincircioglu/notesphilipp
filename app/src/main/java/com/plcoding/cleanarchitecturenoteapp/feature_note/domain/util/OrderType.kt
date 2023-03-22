package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.util

sealed class OrderType{
    // how the notes will be sorted, by ascending order or by descending order?
    object Ascending:OrderType()
    object Descending:OrderType()
}
