package com.gxzzb.gxphotocontest.ui.photoupload;

import com.gxzzb.gxphotocontest.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentPhotoUpload extends Fragment {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.fragment_photoupload, container,
				false);

		return v;
	}

	@Override
	public void onResume() {
		super.onResume();
	}

}
