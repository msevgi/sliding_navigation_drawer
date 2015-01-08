
package com.ikar.nd;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by mustafasevgi on 08/01/15.
 */
public class FragmentHome extends Fragment {
   @Override
   public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
      View view = inflater.inflate(R.layout.fragment_main, container, false);
      TextView t = (TextView) view.findViewById(R.id.section_label);
      return view;
   }
}
