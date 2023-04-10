1. Analyysi String-flyweightista

Jännä. Eipä ois tullu mieleen että tässä on tavallaan flyweight kyseessä.

> Strings computed at runtime are not flyweights by default

Jännä, että silti

```java
"A"+"B"=="AB"
```

2. Analyysi Swingin Border-flyweightista

Sama borderi sieltä lähti jakoon. Flyweight.

3. Analyysi JavaFX:n Border-flyweightista

Tehtiin itse ns swingin flyweight factory ja sillähän se toimi just sillattii.
