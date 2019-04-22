<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>GEEK JOB TRYAL</title>
    </head>
    <body>

        <p>【課題07】</p>
        <p>int型の変数ageに自分の年齢を入れたあと、来年の今の年齢が表示されるようにしよう！</p>
        <p>例）　現在24歳なら　「来年は25歳になります」　と表示する</p>
        -------------------------<br>
        <p>【実行結果】</p><br>
        <?php
        // ここから

        $age = 22; //年齢を変更

        echo "来年は".($age + 1)."歳になります。"; //四則演算を導入


        // ここまで
        ?>

        <!-- これは消しちゃだめなやつ -->
        <?php include "../footer.php" ?>
    </body>
</html>
