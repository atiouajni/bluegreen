# Bluegreen Deployments
Simple demo code for Blue Green Deployments

# steps
```shell
oc new-project bluegreen
oc new-app https://github.com/atiouajni/bluegreen --context-dir=src/bluegreen-php/
oc expose svc bluegreen --port=8080
export BLUEGREEN_URL=$(oc get route bluegreen -o jsonpath='{.spec.host}')

oc set env dc/bluegreen COLOR=green

chrome http://$BLUEGREEN_URL/image.php

# Cleanup
oc delete project bluegreen
```
