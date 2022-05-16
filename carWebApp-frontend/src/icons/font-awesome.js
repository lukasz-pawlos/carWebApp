import { library } from "@fortawesome/fontawesome-svg-core";
import { FontAwesomeIcon } from "@fortawesome/vue-fontawesome";


import {
    faCar,
    faHome,
    faCarAlt
} from "@fortawesome/free-solid-svg-icons";
console.log(faCar)
library.add(faCar, faHome, faCarAlt);
export { FontAwesomeIcon };