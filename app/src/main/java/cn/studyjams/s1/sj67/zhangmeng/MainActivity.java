package cn.studyjams.s1.sj67.zhangmeng;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {
    CheckBox cbReadme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnOpenGithub = (Button) findViewById(R.id.openGithub);
        cbReadme = (CheckBox) findViewById(R.id.cb_readme);
        assert btnOpenGithub != null;
        btnOpenGithub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("来参观鄙人的Github?")
                        .setMessage("这是一个小小的安利，因为你已经读完了关于如何挑选一台性价比高的电脑的建议，如果你认可我的话，欢迎Follow或提建议给我")
                        .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Uri uri = Uri.parse("https://github.com/AnotherM");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);
                            }
                        })
                        .setNegativeButton("取消", null)
                        .show();
            }
        });
    }

    public void openOne(View v) {
        if (cbReadme.isChecked()) {
            Intent intent = new Intent(MainActivity.this, Main2Activity.class);
            startActivity(intent);
        } else {
            new AlertDialog.Builder(this)
                    .setMessage("请确保你已经勾选了“这只是个人观点”")
                    .setPositiveButton("确定", null)
                    .show();
        }
    }

    public void openTwo(View v) {
        if (cbReadme.isChecked()) {
            Intent intent = new Intent(MainActivity.this, Main3Activity.class);
            startActivity(intent);
        } else {
            new AlertDialog.Builder(this)
                    .setMessage("请确保你已经勾选了“这只是个人观点”")
                    .setPositiveButton("确定", null)
                    .show();
        }
    }

    public void openThree(View v) {
        if (cbReadme.isChecked()) {
            Intent intent = new Intent(MainActivity.this, Main4Activity.class);
            startActivity(intent);
        } else {
            new AlertDialog.Builder(this)
                    .setMessage("请确保你已经勾选了“这只是个人观点”")
                    .setPositiveButton("确定", null)
                    .show();
        }
    }

    public void openFour(View v) {
        if (cbReadme.isChecked()) {
            Intent intent = new Intent(MainActivity.this, Main5Activity.class);
            startActivity(intent);
        } else {
            new AlertDialog.Builder(this)
                    .setMessage("请确保你已经勾选了“这只是个人观点”")
                    .setPositiveButton("确定", null)
                    .show();
        }
    }

    public void openFive(View v) {
        if (cbReadme.isChecked()) {
            Intent intent = new Intent(MainActivity.this, Main6Activity.class);
            startActivity(intent);
        } else {
            new AlertDialog.Builder(this)
                    .setMessage("请确保你已经勾选了“这只是个人观点”")
                    .setPositiveButton("确定", null)
                    .show();
        }
    }
}
