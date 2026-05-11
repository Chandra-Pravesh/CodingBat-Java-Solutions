public boolean parrotTrouble(boolean talking, int hour) {
  // return (hour<7 || hour>20)? (talking==true? true: false) : false;
  return (talking)? (hour<7 || hour>20)? true:false : false;
}
