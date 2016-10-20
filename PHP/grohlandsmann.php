<?php 
//Debug
/*
echo $_GET['fst'];
echo $_GET['sth'];
echo $_GET['ast'];
echo $_GET['baujahr'];
*/
$handle =  fopen("kosten.csv","w");
$data = '"Fläsche je Stockwerk in qm";"Stockwerk in m";"Anzahl Stockwerke";"Baujahr"' . "\n";
$data .='"'. $_GET['fst'] .
 '";"'.
 $_GET['sth'] .
 '";"'.
 $_GET['ast'] .
 '";"'.
 $_GET['baujahr'] .
 '"'.
 "\n";
fwrite($handle,$data);
fclose($handle);

?>