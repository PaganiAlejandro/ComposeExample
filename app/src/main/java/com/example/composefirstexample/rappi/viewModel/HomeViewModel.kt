package com.example.composefirstexample.rappi.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.composefirstexample.rappi.data.favoritesHome
import com.example.composefirstexample.rappi.data.storesListFinal
import com.example.composefirstexample.rappi.model.FavoritesModel
import com.example.composefirstexample.rappi.model.StoreModel

class HomeViewModel : ViewModel() {

    private val _listStores = MutableLiveData<List<StoreModel>>()
    val listStores : LiveData<List<StoreModel>> = _listStores

    private val _listFavorites = MutableLiveData<List<FavoritesModel>>()
    val listFavorites: LiveData<List<FavoritesModel>> = _listFavorites

    init {
        _listStores.postValue(storesListFinal)
        _listFavorites.postValue(favoritesHome)
    }
}
