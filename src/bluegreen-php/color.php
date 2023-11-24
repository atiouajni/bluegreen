<?php
$deployment = getenv("COLOR");

if ( $deployment == 'blue') {
  $color = 'blue';
} elseif ($deployment == 'green')  {
  $color = 'green';
} else {
  $color = 'blue';
}

$data = [ 'color' => $color ];
echo json_encode( $data );
http_response_code(200);
?>
