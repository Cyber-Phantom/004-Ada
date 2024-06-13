# If

if (codicao) {
    proc1;
} else {
    proc2;
}

if (codicao) {
    proc1;
} else if {
    proc2;
} else if {
    proc3;
} else {
    proc4;
}

switch (codicao) {
    case cond1: 
    case cond2:
        proc1;
        break;
    case cond3:
        proc2;
        break;
    case cond4:
        proc3;
        break;
    default:
        procFalha;
}

