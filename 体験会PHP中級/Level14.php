<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>GEEK JOB TRYAL</title>
    </head>
    <body>

        <p>【課題14】</p>
        <p> 自動販売機のシステムプログラムです。
        変数moneyに好きな金額を入れてください。</p>

        <?php
        $money = 130 ; //好きな数に変更してください //変更した
        ?>

        <p>以下のifを作成して下さい<br>
		・moneyの値が150以上のとき「ペットボトルを買いました」<br>
		・moneyの値が150未満かつ120以上のとき「缶を買いました」<br>
		・それ以外のときは「何も買えませんでした」<br>
		と表示されるようにしてください。</p>

        -------------------------<br>
        <p>【実行結果】</p><br>
        <?php
        // ここから
        //条件を変更＋表示を変更
        if($money >= 150){
            echo "ペットボトルを買いました";
        } else if($money >= 120){
            echo "缶を買いました";
        } else {
          echo "何も買えませんでした";
        }

        // ここまで
        ?>

        <!-- これは消しちゃだめなやつ -->
        <?php include "../footer.php" ?>
    </body>
</html>
