package com.rjt.assignment.Activities

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rjt.assignment.Fragments.FirstFragment
import com.rjt.assignment.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_first.*

class MainActivity : AppCompatActivity(), FirstFragment.OnFragmentInteractionListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var fragmentManager = supportFragmentManager
        var fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.fragment_container, FirstFragment()).commit()

    }

    override fun onFragmentInteraction_first(first: String) {
        text_view_first.text = first
    }

    override fun onFragmentInteraction_last(last: String) {
        text_view_last.text = last
    }

    override fun onFragmentInteraction_address(address: String) {
        text_view_address.text = address
    }

    override fun onFragmentInteraction_state(state: String) {
        text_view_state.text = state
    }

    override fun onFragmentInteraction_zip(zip: String) {
        text_view_zip.text = zip
    }

    override fun onFragmentInteraction_age(age: String) {
        text_view_age.text = age
    }

    override fun onFragmentInteraction_gender(gender: String) {
        text_view_gender.text = gender
    }

    override fun onFragmentInteraction_phone(phone: String) {
        text_view_phone.text = phone
    }

    override fun onFragmentInteraction_email(email: String) {
        text_view_email.text = email
    }

    override fun onFragmentInteraction_hobby(hobby: String) {
        text_view_hobby.text = hobby
    }
}
