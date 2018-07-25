## 1. ?????
```
path:/ParkingLots (POST)
request:{
    LotId : 1,
    LotName : "?????",
    size : 20
}
response:{
    status:"add ParkingLot successfully"
}
```
## 2.  ??ParkingBoy
```
path: /ParkingBoys (POST)
request:{
    BoyId:1,
    name:"aaa"
}
response:{
    status:"add Parkingboy successfully"
    BoyId:1,
    name:"aaa",
    ParkingLotsList:[]
}
```
## 3.  ?ParkingBoy?????
```
path:/ParkingBoys/{LotId}  (POST)
reques:{
    ParkingLotsList:{
    LotId : 1,
    LotName : "?????",
    size : 20
}

response:{
    status:"add Parkingboy successfully"
    BoyId:1,
    name:"aaa",
    ParkingLotsList:[{
    LotId : 1,
    LotName : "?????",
    size : 20
}]
}
```