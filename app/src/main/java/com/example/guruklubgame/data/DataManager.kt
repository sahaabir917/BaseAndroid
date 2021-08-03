package com.gmpire.guruklub.data
import com.example.guruklubgame.util.DatabaseHelper
import com.gmpire.guruklub.data.local_db.RoomHelper
import com.gmpire.guruklub.data.network.ApiHelper
import com.gmpire.guruklub.data.prefence.PreferencesHelper
import javax.inject.Inject

class DataManager @Inject constructor(
    preferencesHelper: PreferencesHelper, roomHelper: RoomHelper, apiHelper: ApiHelper, databaseHelper: DatabaseHelper
) : IDataManager {

    val mPref = preferencesHelper
    val roomHelper = roomHelper
    val apiHelper = apiHelper
    val databaseHelper = databaseHelper

}