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