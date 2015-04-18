<?php
// run this file to make sure examples have unique hashes
// (coded on an airplane with chris because he knows php)

function h() {
  return substr(md5(rand()), 0,6);
}

$files = glob("*.cljsdoc");

foreach($files as $filename) {
  echo "parsing $filename\n";
  $content = file_get_contents($filename);
  $new = str_replace("Example\n", "Example#".h()."\n", $content);
  echo $new;
  file_put_contents($filename, $new);
}

?>
