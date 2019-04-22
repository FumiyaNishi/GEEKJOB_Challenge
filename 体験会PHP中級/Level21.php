<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>GEEK JOB TRYAL</title>
    </head>
    <body>

        <p>【課題21】</p>
        <p>文字列に対して、決まった文字列を返してみましょう。
		変数を一つ用意し、if文を使って条件分けをしましょう。</p>
        -------------------------<br>
        <p>【実行結果】</p><br>
        <?php
        // ここから

        $q = "今日は何曜日？";
        $questions = array('今日の天気は？', '今日は何曜日？', 'Hey,Siri!');
        $answers = ["晴れるといいですね", "日曜日だと嬉しいです", "そこまで高性能ではありません"];

        for($i = 0; $i < count($questions); $i++) {
          if($q == $questions[$i]){
            echo $answers[$i];
            break;
          }
        }

        if($i == count($questions)) echo "想定されていません";

        // ここまで
        ?>
        <!-- これは消しちゃだめなやつ -->
        <?php include "../footer.php" ?>
    </body>
</html>
