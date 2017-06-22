package chao.mvpdemo.widget;

import android.app.Activity;
import android.support.v7.app.AlertDialog;

import chao.mvpdemo.R;

/**
 * Created by Chao on 2017/6/5.
 */

public class WYDialog {

    private static AlertDialog dialog;

    public static void showProcessDialog(Activity activity){
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(R.layout.process_dialog);
        dialog = builder.create();
        dialog.show();
    }
    public static void hideProgressDialog(){
        if (dialog!=null&&dialog.isShowing()){
            dialog.dismiss();
        }
    }

}