package com.egci428.mobileproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import android.app.ListActivity;
import android.widget.ArrayAdapter;

class usersListViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_users_list_view)
    }

    var itemname<ArrayAdapter>
        String[] itemname ={
            "Safari",
            "Camera",
            "Global",
            "FireFox",
            "UC Browser",
            "Android Folder",
            "VLC Player",
            "Cold War"
        };

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            this.setListAdapter(new ArrayAdapter<String>(
                    this, R.layout.mylist,
                    R.id.Itemname,itemname));
        }
    }

}
