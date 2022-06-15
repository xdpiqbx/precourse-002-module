# Домашнее задание

## Ты делаешь графический редактор.

### Продумай иерархию классов. Здесь должны быть как минимум:

- базовый класс для фигуры Shape. Этот класс должен иметь метод для вывода имени фигуры.
- классы-наследники - Circle, Quad и т.д. - не меньше 5 вариантов;
- должен быть класс, который принимает фигуру, и выводит ее название. Класс должен работать именно с базовым классов Shape.

_Обрати внимание на использование интерфейсов, абстрактных классов, модификаторов доступа._

Нет единого правильного способа решения этой задачи. Попытайся спроектировать гибкую архитектуру, задавая себе вопросы вида "А что будет, если этот класс нужно будет менять? Что еще поменяется, если здесь нужно будет расширить?".

---

## Ideas
- workspace

- layer

- drawable
- writable
- editable
  - draggable
  - resizable
  - rotatable
- deletable
 
- point
- line
- ellipse
- rectangle
- polygon
  - addSide
- star
  - addRay
  - numberOfRays
  - lengthOfRays
- text
  - font
  - color
  - size
  - align

- border
- fillColor
 
- Shape properties
  - isEllipse
  - isEquilateral
  - isEquiangular
    - isRegular
    - isIrregular
  - zIndexPosition
  - position
  - size 
  - group (class)