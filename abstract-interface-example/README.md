# abstract-interface-example
<!-- ALL-CONTRIBUTORS-BADGE:START - Do not remove or modify this section -->
[![All Contributors](https://img.shields.io/badge/all_contributors-1-orange.svg?style=flat-square)](#contributors-)
<!-- ALL-CONTRIBUTORS-BADGE:END -->

## animal.abstractclass
This package contains an abstract class `Animal` and its concrete implementations `Dog` and `Cat`. An abstract class would be the correct way to go in this scenario, since many elements are common and reuseable.

## animal.intrface
This package contains an interface `Animal` and two classes `Dog` and `Cat` which implement it. In this example the interface forces the developer to provide separate implementations for the same functionality. (_intrface_ is not a typo, java won't allow package names to use java keywords)

## person
This package shows how to use interfaces effectively. It has three unrelated classes like `Person`, `Dog` and `Monkey` which are grouped together using the interface `Singable`. The `Singable` interface specifies that anyone who implements it will know how to `sing()`. `SingingDancingMonkey` shows how to implement multiple interfaces.

Test commit

## Contributors ✨

Thanks goes to these wonderful people ([emoji key](https://allcontributors.org/docs/en/emoji-key)):

<!-- ALL-CONTRIBUTORS-LIST:START - Do not remove or modify this section -->
<!-- prettier-ignore-start -->
<!-- markdownlint-disable -->
<table>
  <tr>
    <td align="center"><a href="https://kennyj.me/"><img src="https://avatars1.githubusercontent.com/u/19240564?v=4" width="100px;" alt=""/><br /><sub><b>Kenny John Jacob</b></sub></a><br /><a href="#projectManagement-johnjacobkenny" title="Project Management">📆</a></td>
  </tr>
</table>

<!-- markdownlint-enable -->
<!-- prettier-ignore-end -->
<!-- ALL-CONTRIBUTORS-LIST:END -->

This project follows the [all-contributors](https://github.com/all-contributors/all-contributors) specification. Contributions of any kind welcome!