package com.rainforce.safetripandroid.ui.safetripmain

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rainforce.safetripandroid.R

class SafeTripMainFragment : Fragment() {

    companion object {
        fun newInstance() = SafeTripMainFragment()
    }

    private lateinit var viewModel: SafeTripMainViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.safe_trip_main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(SafeTripMainViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
