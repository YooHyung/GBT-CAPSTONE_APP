// Generated by view binder compiler. Do not edit!
package com.example.ch16_provider.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.ch16_provider.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button cameraButton;

  @NonNull
  public final Button galleryButton;

  @NonNull
  public final ImageView userImageView;

  private ActivityMainBinding(@NonNull LinearLayout rootView, @NonNull Button cameraButton,
      @NonNull Button galleryButton, @NonNull ImageView userImageView) {
    this.rootView = rootView;
    this.cameraButton = cameraButton;
    this.galleryButton = galleryButton;
    this.userImageView = userImageView;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cameraButton;
      Button cameraButton = ViewBindings.findChildViewById(rootView, id);
      if (cameraButton == null) {
        break missingId;
      }

      id = R.id.galleryButton;
      Button galleryButton = ViewBindings.findChildViewById(rootView, id);
      if (galleryButton == null) {
        break missingId;
      }

      id = R.id.userImageView;
      ImageView userImageView = ViewBindings.findChildViewById(rootView, id);
      if (userImageView == null) {
        break missingId;
      }

      return new ActivityMainBinding((LinearLayout) rootView, cameraButton, galleryButton,
          userImageView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
