The output files: ldp.html, ldp.ttl and ldp.jsonld get committed to the W3C Mercurial repo at:
   https://dvcs.w3.org/hg/ldpwg/file/default/tests/reports

To general a the ldp.html true report needed, you can simply do the following:
$earl-report -f html -o ldp.html --name "LDP" --bibRef "[[LDP]]" --template ldp-template.html.haml --manifest ldp-earl-manifest.ttl contrib/*.ttl 

Just need json?
$earl-report -f json -o ldp.jsonld --manifest ldp-earl-manifest.ttl contrib/*.ttl 

Just need turtle?
$earl-report -f ttl -o ldp.ttl --manifest ldp-earl-manifest.ttl contrib/*.ttl 

Already have json but need html?
$earl-report -f html --json ldp.jsonld --template ldp-template.html.haml -o ldp.html 
