$dbname = "tabelle2025";
$dbhost = "localhost";
dbuser = "root@localhost";
$dbpw = "";
$sql = "select * form tabelle2025";

$db_link = new PDO("mysql:host=$dbhost; dbname=$dbname", $dbuser, $dbpw;

$pdostmt = $db_link -> prepare($$sql) #sql statement als string

$pdostmt -> execute(array()); 

$ergebnis = pdostmt -> fetchAll();