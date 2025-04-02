# 设计模式

## 创建型设计模式 creational
### 装配器设计模式 Decorate

---

```mermaid
classDiagram
direction BT
class BasicPizza {
  + make() String
}
class Cheese {
  + make() String
}
class Curry {
  + make() String
}
class DecoratorClient {
  + main(String[]) void
}
class Pizza {
<<Interface>>
  + make() String
}
class ToppingDecorator {
  # Pizza pizza
  + make() String
}

BasicPizza  ..>  Pizza 
Cheese  -->  ToppingDecorator 
Curry  -->  ToppingDecorator 
DecoratorClient  ..>  BasicPizza : «create»
DecoratorClient  ..>  Cheese : «create»
DecoratorClient  ..>  Curry : «create»
ToppingDecorator  ..>  Pizza 
ToppingDecorator "1" *--> "pizza 1" Pizza 

```

---

