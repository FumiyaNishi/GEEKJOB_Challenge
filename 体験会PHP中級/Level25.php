<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>GEEK JOB TRYAL</title>
    </head>
    <body>

        <p>【課題25】</p>
        <p>forを用いて、1番目から50番目までの三角数を表示させよう</p>
        -------------------------<br>
        <p>【実行結果】</p><br>
        <?php
        // ここから

        $trinum = 0;
        for($i = 1; $i <= 50; $i++) {
          $trinum += $i;
          echo $trinum."<br>";
        }



        // ここまで
        ?>
        <!-- これは消しちゃだめなやつ -->
        <?php include "../footer.php" ?>
    </body>
</html>
