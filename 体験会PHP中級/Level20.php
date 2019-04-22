<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>GEEK JOB TRYAL</title>
    </head>
    <body>

        <p>【課題20】</p>
        <p>FizzBuzzの作成！</p>
        -------------------------<br>
        <p>【実行結果】</p><br>
        <?php
        // ここから
        //全て追加

        for($i=1;$i<=20;$i++){
          echo $i." ";
          if($i % 3 == 0) echo "fizz";
          if($i % 5 == 0) echo "buzz";
          echo "<br>";
          }

        // ここまで
        ?>

        <!-- これは消しちゃだめなやつ -->
        <?php include "../footer.php" ?>
    </body>
</html>
