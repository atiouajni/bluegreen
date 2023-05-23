# Bluegreen Deployments
Simple demo code for Blue Green Deployments

# steps
oc new-project bluegreen
oc new-app https://github.com/atiouajni/bluegreen --context-dir=src/bluegreen-php/
oc expose svc bluegreen --port=8080
oc get route bluegreen -o jsonpath='{.spec.host}')

oc set env dc/bluegreen COLOR=green

export GATEWAY_URL=$(oc -n istio-system get route istio-ingressgateway -o jsonpath='{.spec.host}')
chrome http://$GATEWAY_URL/image.php

# Cleanup
oc delete project bluegreen

