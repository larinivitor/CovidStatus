package com.projetoIF.covidStatus.ui.activities

import android.app.Dialog
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.projetoIF.covidStatus.R
import com.projetoIF.covidStatus.databinding.ActivityMainBinding
import com.projetoIF.covidStatus.ui.viewmodel.MainViewModel
import com.projetoIF.covidStatus.utils.Utils

class MainActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding
    private val mMainViewModel by viewModels<MainViewModel>()
    private lateinit var mDialogLoading : Dialog
    private lateinit var mDialogError: Dialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        mDialogLoading = Utils.showAlertDialog(this, 1)
        mDialogError = Utils.showAlertDialog(this, 2)
        setContentView(mBinding.root)
        setupBottomNavigation()
        setObservesUI()
    }

    private fun setObservesUI() {
        mMainViewModel.isLoading.observe(this, {
            if (it) {
                mDialogLoading.show()
            } else {
                mDialogLoading.dismiss()
            }
        })
        mMainViewModel.errorOccured.observe(this, {
            if (it) {
                mDialogError.show()
            } else {
                mDialogError.dismiss()
            }
        })
    }

    private fun setupBottomNavigation() {
        val bottomNavigation = mBinding.bottomNavigation
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.navHostFragment) as NavHostFragment
        val navController = navHostFragment.navController
        NavigationUI.setupWithNavController(bottomNavigation, navController)
    }
}