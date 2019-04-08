<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ナベアツ課題</title>
</head>
<body>
	<h1>ナベアツ課題</h1>
       <?php
        //　----------ここから下へソースコードを書く------------
				$num = 1;
        while($num <= 40){
					echo $num;
					if($num % 3 == 0 || ($num - 3) % 10 == 0 || ($num >= 30 && $num < 40))
						echo " アホになる";
					if($num % 5 == 0)
						echo " 犬っぽくなる";
					echo "<br>";
					$num++;
				}
       //　-------------------------ここまで------------------------------
        ?>
</body>
</html>
