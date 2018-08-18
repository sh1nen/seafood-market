import Rebase from "re-base";
import firebase from "firebase";

const firebaseApp = firebase.initializeApp({
  apiKey: "AIzaSyCtAR0LgiCDDmNeOmoBEsw82srve7SvBkY",
  authDomain: "catch-of-the-day-4828c.firebaseapp.com",
  databaseURL: "https://catch-of-the-day-4828c.firebaseio.com"
});

const database = Rebase.createClass(firebase.database());

export { firebaseApp };
export default database;
