<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>GEEK JOB TRYAL</title>
    </head>
    <body>

        <p>【課題29】</p>
        <p>配列を基に、「GEEKJOB」と表示させて下さい</p>
        -------------------------<br>
        <p>【実行結果】</p><br>
        <?php
        // ここから
        $message = array(
            "P","G",
            "R","E",
            "O","E",
            "G","K",
            "R","J",
            "A","O",
            "M","B");

        //追加
        foreach($message as $index => $letter) {
          if($index % 2 == 1) echo $letter;
        }


        // ここまで
        ?>
        <!-- これは消しちゃだめなやつ -->
        <?php include "../footer.php" ?>
    </body>
</html>
