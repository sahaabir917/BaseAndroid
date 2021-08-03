package com.example.guruklubgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.guruklubgame.view.ProgressBarListener
import com.gmpire.guruklub.guruklubgame.R
import com.gmpire.guruklub.guruklubgame.databinding.ActivityMainBinding
import com.gmpire.guruklub.util.LiveDataResult
import com.gmpire.guruklub.view.base.BaseActivity
import okhttp3.ResponseBody
import retrofit2.Response

class MainActivity : BaseActivity(), ProgressBarListener {
    private lateinit var binding : ActivityMainBinding
    override fun viewRelatedTask() {

    }

    override fun navigateToHome() {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
    }

    override fun onSuccess(result: LiveDataResult<Response<ResponseBody>>, key: String) {

    }

    override fun onClick(v: View?) {

    }

    override fun showProgress() {

    }

    override fun hideProgress() {

    }
}