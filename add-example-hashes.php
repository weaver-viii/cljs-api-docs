<?php

function h() {
  return substr(md5(rand()), 0,6);
}

$files = glob("*.cljsdoc");

foreach($files as $filename) {
  echo "parsing $filename\n";
  $lines = file($filename);
  for($i=0; $i<count($lines); $i++) {
    $lines[$i] = str_replace("Example\n", "Example#".h()."\n", $lines[$i]);
  }
  file_put_contents($filename, join("",$lines));
}

?>
