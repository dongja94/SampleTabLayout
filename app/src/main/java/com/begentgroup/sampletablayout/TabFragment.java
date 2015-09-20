package com.begentgroup.sampletablayout;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class TabFragment extends Fragment {

    public static final String EXTRA_TAB_NAME = "tabname";
    public static Fragment instantiate(String tabName) {
        Fragment f = new TabFragment();
        Bundle b = new Bundle();
        b.putString(EXTRA_TAB_NAME, tabName);
        f.setArguments(b);
        return f;
    }

    public TabFragment() {

    }

    private String tabName;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle b = getArguments();
        if (b != null) {
            tabName = b.getString(EXTRA_TAB_NAME);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tab, container, false);
        TextView messageView = (TextView)view.findViewById(R.id.text_message);
        messageView.setText("Child : " + tabName);
        return view;
    }


}
