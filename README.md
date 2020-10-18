# komoran 통합 안내
현재 본 repository는 KOMORAN repository에 통합되었습니다.  
아래 링크에서 확인 가능합니다.  
https://github.com/shineware/KOMORAN/tree/master/elasticsearch-plugin

# komoran-tokenizer
komoran for elasticsearch

# How to create komoran-tokenizer plugin
./gradlew makePlugin

# How to install komoran-tokenizer
\bin\elasticsearch-plugin install file:\\\path\to\plugin.zip

# how to test komoran-tokenizer working
request type : POST  
url : localhost:9200/_analyze  
body : `{
           "tokenizer": "komoran-tokenizer",
           "text": "나는 사과를 먹는다. 집에 가고 싶다."
       }`
