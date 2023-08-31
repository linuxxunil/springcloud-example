# 功能描述：
1. 主要實現讓 orderservice 與 userserivce 註冊到 nacos
2. orderservice通過 openfeign 取得 user的資訊

# 安裝與啟動步驟
1. 透過 ./sql/*.sql 安裝資料庫資訊
2. 先執行 nacos 
cd nacos
sh startup.sh -m standanlone

3. 登入 Nacos，並設定 Configuration
3.1 加入 userservice.yaml 和 userservice-dev.yaml
3.2 加入 orderservice.yaml 和 orderservice-dev.yaml

4. 執行 userservice 與 orderservice
4.1 執行 GET http://127.0.0.1/order/1 即可看到User被包進來的結果
4.2 執行 GET http://127.0.0.1/order/prop 即可看到設定檔更新於 nacos




