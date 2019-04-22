<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>GEEK JOB TRYAL</title>
    </head>
    <body>

        <p>【課題22】</p>
        <p>変数heightに身長の値を、変数weightに体重の値を任意で入れてください
		</br>BMIの値に応じて「痩せすぎ！」や「太り過ぎ！」など表示するように条件分岐させてください。</p>
        -------------------------<br>
        <p>【実行結果】</p><br>
        <?php
        // ここから

        $height = 1.7;
        $weight = 64;
        $bmi = $weight / $height / $height;
        echo "BMI = ".$bmi."<br>";

        if($bmi < 18.5) echo "やせすぎ！";
        else if($bmi < 25) echo "もんだいなし！";
        else echo "ふとりすぎ！";

        // ここまで
        ?>
        <!-- これは消しちゃだめなやつ -->
        <?php include "../footer.php" ?>
    </body>
</html>
