package com.example.android.quizzapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void submitQuizz (View view) {
        EditText monQuartier = (EditText) findViewById(R.id.mon_quartier);
        String name = monQuartier.getText().toString();

        EditText categoriePro = (EditText) findViewById(R.id.categorie_pro);
        String nameOne = categoriePro.getText().toString();

        EditText vosBoissons = (EditText) findViewById(R.id.vos_boissons);
        String nameTwo = vosBoissons.getText().toString();

        EditText boissonsAchetees = (EditText) findViewById(R.id.boissons_achetees);
        String nameThree = boissonsAchetees.getText().toString();

        EditText boissonsConsommees = (EditText) findViewById(R.id.boissons_consommees);
        String nameFour = boissonsConsommees.getText().toString();

        EditText problemeBoissons = (EditText) findViewById(R.id.probleme_boissons);
        String nameFive = problemeBoissons.getText().toString();

        EditText vosSuggestions = (EditText) findViewById(R.id.vos_suggestions);
        String nameSix = vosSuggestions.getText().toString();

        EditText pourMoi = (EditText) findViewById(R.id.pour_moi);
        String nameSeven = pourMoi.getText().toString();

        EditText pourMaFamille = (EditText) findViewById(R.id.pour_ma_famille);
        String nameEight = pourMaFamille.getText().toString();

        EditText pourMesAmis = (EditText) findViewById(R.id.pour_mes_amis);
        String nameNine = pourMesAmis.getText().toString();

        EditText pourUneConnaissance = (EditText) findViewById(R.id.pour_une_connaisance);
        String nameTen = pourUneConnaissance.getText().toString();

        EditText pourPersonne = (EditText) findViewById(R.id.pour_personne);
        String nameEleven = pourPersonne.getText().toString();

        EditText bonneQualite = (EditText) findViewById(R.id.bonne_qualite);
        String nameTwelve = bonneQualite.getText().toString();

        EditText tropGazeuses = (EditText) findViewById(R.id.trop_gazeuses);
        String nameThirteen = tropGazeuses.getText().toString();

        EditText tresSucrees = (EditText) findViewById(R.id.tres_sucrees);
        String nameFourteen = tresSucrees.getText().toString();

        EditText peuConcentrees = (EditText) findViewById(R.id.peu_concentrees);
        String nameFifteen = peuConcentrees.getText().toString();

        EditText dispo = (EditText) findViewById(R.id.dispo);
        String nameSixteen = dispo.getText().toString();

        EditText chere = (EditText) findViewById(R.id.cheres);
        String nameSeveteen = chere.getText().toString();

        EditText variee = (EditText) findViewById(R.id.variees);
        String nameEighteen = variee.getText().toString();

        CheckBox unHomme = (CheckBox) findViewById(R.id.un_homme);
        boolean hasUnHomme = unHomme.isChecked();

        CheckBox uneFemme = (CheckBox) findViewById(R.id.une_femme);
        boolean hasUneFemme = uneFemme.isChecked();

        CheckBox vingtCinq = (CheckBox) findViewById(R.id.vingt_cinq);
        boolean hasVingtCinq = vingtCinq.isChecked();

        CheckBox trenteCinq = (CheckBox) findViewById(R.id.trente_cinq);
        boolean hasTrenteCinq = trenteCinq.isChecked();

        CheckBox quaranteCinq = (CheckBox) findViewById(R.id.quarante_cinq);
        boolean hasQuaranteCinq = quaranteCinq.isChecked();

        CheckBox cinquanteCinq = (CheckBox) findViewById(R.id.cinquante_cinq);
        boolean hasCinquanteCinq = cinquanteCinq.isChecked();

        CheckBox plusCinquante = (CheckBox) findViewById(R.id.plus_cinquante);
        boolean hasPlusCinquante = plusCinquante.isChecked();

        CheckBox proSalarie = (CheckBox) findViewById(R.id.pro_salarie);
        boolean hasProSalaire = proSalarie.isChecked();

        CheckBox proCommercant = (CheckBox) findViewById(R.id.pro_commercants);
        boolean hasProCommercant = proCommercant.isChecked();

        CheckBox proOuvriers = (CheckBox) findViewById(R.id.pro_ouvriers);
        boolean hasProOuvriers = proOuvriers.isChecked();

        CheckBox proAutres = (CheckBox) findViewById(R.id.pro_autres);
        boolean hasProAutres = proAutres.isChecked();

        CheckBox laNotoriete = (CheckBox) findViewById(R.id.la_notoriete);
        boolean hasLaNotoriete = laNotoriete.isChecked();

        CheckBox qualiteProduit = (CheckBox) findViewById(R.id.qualité_produit);
        boolean hasQualiteProduit = qualiteProduit.isChecked();

        CheckBox dispoProduit = (CheckBox) findViewById(R.id.dispo_produit);
        boolean hasDispoProduit = dispoProduit.isChecked();

        CheckBox lePrix = (CheckBox) findViewById(R.id.le_prix);
        boolean hasLePrix = lePrix.isChecked();

        CheckBox enVac = (CheckBox) findViewById(R.id.en_vac);
        boolean hasEnVac = enVac.isChecked();

        CheckBox avantFete = (CheckBox) findViewById(R.id.avant_fete);
        boolean hasAvantFete = avantFete.isChecked();

        CheckBox regulier = (CheckBox) findViewById(R.id.regulier);
        boolean hasRegulier = regulier.isChecked();

        CheckBox ponctuel = (CheckBox) findViewById(R.id.ponctuel);
        boolean hasPonctuel = ponctuel.isChecked();

        CheckBox achatOui = (CheckBox) findViewById(R.id.achat_oui);
        boolean hasAchatOui = achatOui.isChecked();

        CheckBox achatNon = (CheckBox) findViewById(R.id.achat_non);
        boolean hasAchatNon = achatNon.isChecked();

        CheckBox uneFoisSemaine = (CheckBox) findViewById(R.id.une_fois_semaine);
        boolean hasUneFoisSemaine = uneFoisSemaine.isChecked();

        CheckBox deuxFoisSemaine = (CheckBox) findViewById(R.id.deux_fois_semaine);
        boolean hasDeuxFoisSemaine = deuxFoisSemaine.isChecked();

        CheckBox uneFoisMois = (CheckBox) findViewById(R.id.une_fois_mois);
        boolean hasUneFoisMois = uneFoisMois.isChecked();

        CheckBox deuxFoisMois = (CheckBox) findViewById(R.id.deux_fois_mois);
        boolean hasDeuxFoisMois = deuxFoisMois.isChecked();

        CheckBox troisFoisMois = (CheckBox) findViewById(R.id.trois_fois_mois);
        boolean hasTroisFoisMois = troisFoisMois.isChecked();

        CheckBox occasion = (CheckBox) findViewById(R.id.occasion);
        boolean hasOccasion = occasion.isChecked();

       /* CheckBox uneFois = (CheckBox) findViewById(R.id.une_fois);
        boolean hasUneMois = uneFois.isChecked();

        CheckBox deuxFois = (CheckBox) findViewById(R.id.deux_fois);
        boolean hasDeuxFois = deuxFois.isChecked();

        CheckBox troisFois = (CheckBox) findViewById(R.id.trois_fois);
        boolean hasTroisFois = troisFois.isChecked();

        CheckBox plusTroisFois = (CheckBox) findViewById(R.id.plus_trois_fois);
        boolean hasPlusTroisFois = plusTroisFois.isChecked();*/

        CheckBox moinsUneFois = (CheckBox) findViewById(R.id.moins_une_fois);
        boolean hasMoinsUneFois = moinsUneFois.isChecked();

        CheckBox uneDeuxFois = (CheckBox) findViewById(R.id.une_deux_fois);
        boolean hasUneDeuxFois = uneDeuxFois.isChecked();

        CheckBox deuxTroisFois = (CheckBox) findViewById(R.id.deux_trois_fois);
        boolean hasDeuxTroisFois = deuxTroisFois.isChecked();

        CheckBox troisFoisPlus = (CheckBox) findViewById(R.id.trois_fois_plus);
        boolean hasTroisFoisPlus = troisFoisPlus.isChecked();

        CheckBox dixHeures = (CheckBox) findViewById(R.id.dix_heures);
        boolean hasDixHeures = dixHeures.isChecked();

        CheckBox douzeHeures = (CheckBox) findViewById(R.id.douze_heures);
        boolean hasDouzeHeures = douzeHeures.isChecked();

        CheckBox quatorzeHeures = (CheckBox) findViewById(R.id.quatorze_heures);
        boolean hasQuatorzeHeures = quatorzeHeures.isChecked();

        CheckBox seizeHeures = (CheckBox) findViewById(R.id.seize_heures);
        boolean hasSeizeHeures = seizeHeures.isChecked();

        CheckBox dixHuitHeures = (CheckBox) findViewById(R.id.dix_huit_heures);
        boolean hasDixHuitHeures = dixHuitHeures.isChecked();

        CheckBox apresDixHuitHeures = (CheckBox) findViewById(R.id.apres_dix_huit_heures);
        boolean hasApresDixHuiHeures = apresDixHuitHeures.isChecked();

        CheckBox cosVes = (CheckBox) findViewById(R.id.cos_ves);
        boolean hasCosVes = cosVes.isChecked();

        CheckBox boisGaz = (CheckBox) findViewById(R.id.bois_gaz);
        boolean hasBoisGaz = boisGaz.isChecked();

        CheckBox chaBoPa = (CheckBox) findViewById(R.id.cha_bo_pa);
        boolean hasChaBoPa = chaBoPa.isChecked();

        CheckBox quatreCents = (CheckBox) findViewById(R.id.quatre_cents);
        boolean hasQuatreCents = quatreCents.isChecked();

        CheckBox cinqCents = (CheckBox) findViewById(R.id.cinq_cents);
        boolean hasCinqCents = cinqCents.isChecked();

        CheckBox sixCents = (CheckBox) findViewById(R.id.six_cents);
        boolean hasSixCents = sixCents.isChecked();

        CheckBox plusSixCents = (CheckBox) findViewById(R.id.plus_six_cents);
        boolean hasPlusSixCents = plusSixCents.isChecked();

        CheckBox yesProb = (CheckBox) findViewById(R.id.yes_prob);
        boolean hasYesProb = yesProb.isChecked();

        CheckBox noProb = (CheckBox) findViewById(R.id.no_prob);
        boolean hasNoProb = noProb.isChecked();

        CheckBox deuxMilles = (CheckBox) findViewById(R.id.deux_milles);
        boolean hasDeuxMilles = deuxMilles.isChecked();

        CheckBox cinqMilles = (CheckBox) findViewById(R.id.cinq_milles);
        boolean hasCinqMilles = cinqMilles.isChecked();

        CheckBox plusCinqMilles = (CheckBox) findViewById(R.id.plus_cinq_milles);
        boolean hasPlusCinqMilles = plusCinqMilles.isChecked();

        String messageToDisplay = createQuizzSummary(name, nameOne, nameTwo, nameThree, nameFour, nameFive, nameSix, nameSeven, nameEight,
                nameNine, nameTen, nameEleven, nameTwelve,
                nameThirteen, nameFourteen, nameFifteen, nameSixteen, nameSeveteen, nameEighteen, hasUnHomme, hasUneFemme, hasVingtCinq,
                hasTrenteCinq, hasQuaranteCinq, hasCinquanteCinq, hasPlusCinquante,
                hasProSalaire, hasProCommercant, hasProOuvriers, hasProAutres, hasLaNotoriete, hasQualiteProduit, hasDispoProduit,
                hasLePrix, hasEnVac, hasAvantFete, hasRegulier, hasPonctuel, hasAchatOui, hasAchatNon, hasUneFoisSemaine, hasDeuxFoisSemaine,
                hasUneFoisMois, hasDeuxFoisMois,hasTroisFoisMois, hasOccasion, hasMoinsUneFois,hasUneDeuxFois,hasDeuxTroisFois, hasTroisFoisPlus,
                hasDixHeures, hasDouzeHeures, hasQuatorzeHeures, hasSeizeHeures, hasDixHuitHeures, hasApresDixHuiHeures, hasCosVes,
                hasBoisGaz, hasChaBoPa, hasQuatreCents, hasCinqCents, hasSixCents, hasPlusSixCents, hasYesProb, hasNoProb, hasDeuxMilles,
                hasCinqMilles, hasPlusCinqMilles);

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto: dadal_prsal@yahoo.fr"));
        intent.putExtra(Intent.EXTRA_SUBJECT, "Questionnaire d'écoute client et de satisfaction");
        intent.putExtra(Intent.EXTRA_TEXT, messageToDisplay);
        if (intent.resolveActivity(getPackageManager()) != null){
            startActivity(intent);
        }

    }

        private String createQuizzSummary (String name, String nameOne, String nameTwo, String nameThree, String nameFour, String nameFive, String nameSix, String nameSeven, String nameEight,
                                           String nameNine, String nameTen, String nameEleven, String nameTwelve, String nameThirteen, String nameFourteen, String nameFifteen, String nameSixteen,
                                           String nameSeveteen, String nameEighteen, boolean hasUnHomme, boolean hasUneFemme, boolean hasVingtCinq, boolean hasTrenteCinq, boolean hasQuaranteCinq,
                                           boolean hasCinquanteCinq,
                                           boolean hasPlusCinquante, boolean hasProSalaire, boolean hasProCommercant, boolean hasProOuvriers, boolean hasProAutres, boolean hasLaNotoriete,
                                           boolean hasQualiteProduit, boolean hasDispoProduit, boolean hasLePrix, boolean hasEnVac, boolean hasAvantFete, boolean hasRegulier, boolean hasPonctuel,
                                           boolean hasAchatOui, boolean hasAchatNon, boolean hasUneFoisSemaine, boolean hasDeuxFoisSemaine, boolean hasUneFoisMois, boolean hasDeuxFoisMois,
                                           boolean hasTroisFoisMois, boolean hasOccasion, boolean hasMoinsUneFois,boolean hasUneDeuxFois, boolean hasDeuxTroisFois, boolean hasTroisFoisPlus,
                                           boolean hasDixHeures, boolean hasDouzeHeures, boolean hasQuatorzeHeures, boolean hasSeizeHeures, boolean hasDixHuitHeures, boolean hasApresDixHuiHeures,
                                           boolean hasCosVes, boolean hasBoisGaz, boolean hasChaBoPa, boolean hasQuatreCents,
                                           boolean hasCinqCents, boolean hasSixCents, boolean hasPlusSixCents, boolean hasYesProb, boolean hasNoProb, boolean hasDeuxMilles, boolean hasCinqMilles,
                                           boolean hasPlusCinqMilles) {

        String messageToDisplay = "Votre quartier : " + name;

        messageToDisplay += "\n";

        messageToDisplay += "\nVous êtes un homme : " + hasUnHomme;
        messageToDisplay += "\nVous êtes une femme : " + hasUneFemme;

        messageToDisplay += "\n";

        messageToDisplay += "\nVotre tranche d'âge : ";
        messageToDisplay += "\nVous avez moins de 25 ans : " + hasVingtCinq;
        messageToDisplay += "\nVous avez entre 26 ans et 35 ans : " + hasTrenteCinq;
        messageToDisplay += "\nVous avez entre 36 ans et 45 ans : " + hasQuaranteCinq;
        messageToDisplay += "\nVous avez entre 46 ans et 55 ans : " + hasCinquanteCinq;
        messageToDisplay += "\nVous avez plus de 55 ans : " + hasPlusCinquante;

        messageToDisplay += "\n";

        messageToDisplay += "\nVotre catégorie socioprofessionnelle : ";
        messageToDisplay += "\nVous êtes salarié : " + hasProSalaire;
        messageToDisplay += "\nVous êtes commerçant : " + hasProCommercant;
        messageToDisplay += "\nVous êtes ouvriers : " + hasProOuvriers;
        messageToDisplay += "\nVous êtes autres : " + hasProAutres;
        messageToDisplay += "\nAutres : " + nameOne;

        messageToDisplay += "\n";

        messageToDisplay += "\nVos critères de choix d'une boisson gazeuse : ";
        messageToDisplay += "\nLa notoriété : " + hasLaNotoriete;
        messageToDisplay += "\nLa qualité du produit : " + hasQualiteProduit;
        messageToDisplay += "\nLa disponibilité du produit : " + hasDispoProduit;
        messageToDisplay += "\nLe prix : " + hasLePrix;

        messageToDisplay += "\n";

        messageToDisplay += "\nLes boissons gazeuses que vous connaissez : " + nameTwo;

        messageToDisplay += "\n";

        messageToDisplay += "\nLes boissons gazeuses que vous avez déjà achetées dans un supermarché : " + nameThree;

        messageToDisplay += "\n";

        messageToDisplay += "\nLes boissons gazeuses que vous avez déjà consommées : " + nameFour;

        messageToDisplay += "\n";

        messageToDisplay += "\nPour qui achetez-vous les boissons gazeuses Planet dans les supermarchés ? :";
        messageToDisplay += "\nJ'achète les boissons gazeuses pour moi : " + nameSeven;
        messageToDisplay += "\nJ'achète les boissons gazeuses pour ma famille : " + nameEight;
        messageToDisplay += "\nJ'achète les boissons gazeuses pour mes amis : " + nameNine;
        messageToDisplay += "\nJ'achète les boissons gazeuses pour une connaissance : " + nameTen;
        messageToDisplay += "\nJe n'achète pas les boissons gazeuses Planet : " + nameEleven;

        messageToDisplay += "\n";

        messageToDisplay += "\nLe moment pendant lequel vous achetez le plus les boissons gazeuses : ";
        messageToDisplay += "\nEn vacances : " + hasEnVac;
        messageToDisplay += "\nAvant les fêtes : " + hasAvantFete;
        messageToDisplay += "\nRégulièrement : " + hasRegulier;
        messageToDisplay += "\nPonctuellement pour offrir : " + hasPonctuel;

        messageToDisplay += "\n";

        messageToDisplay += "\nA ce moment-là achetez-vous les boissons gazeuses Planet ? : ";
        messageToDisplay += "\nOui : " + hasAchatOui;
        messageToDisplay += "\nNon : " + hasAchatNon;

        messageToDisplay += "\n";

        messageToDisplay += "\nA quelle fréquence ? : ";
        messageToDisplay += "\nUne fois par semaine  : " + hasUneFoisSemaine;
        messageToDisplay += "\nUne fois par mois : " + hasUneFoisMois;
        messageToDisplay += "\nDeux fois par mois : " + hasDeuxFoisMois;
        messageToDisplay += "\nTrois fois par mois : " + hasTroisFoisMois;
        messageToDisplay += "\nOccasionnellement : " + hasOccasion;

        messageToDisplay += "\n";

        messageToDisplay += "\nEn moyenne, combien de fois par semaine achetez-vous les boissons gazeuses Planet dans les supermarchés ? : ";
        messageToDisplay += "\nMoins d'une fois  : " + hasMoinsUneFois;
        messageToDisplay += "\nUne à deux fois : " + hasUneDeuxFois;
        messageToDisplay += "\nDeux à trois fois : " + hasDeuxTroisFois;
        messageToDisplay += "\nPlus de trois fois : " + hasTroisFoisPlus;

        messageToDisplay += "\n";

        messageToDisplay += "\nLe plus souvent, dans quelle tranche horaire venez-vous au supermarché ? : ";
        messageToDisplay += "\nEntre 8h et 10h  : " + hasDixHeures;
        messageToDisplay += "\nEntre 10h et 12h : " + hasDouzeHeures;
        messageToDisplay += "\nEntre 12h et 14h : " + hasQuatorzeHeures;
        messageToDisplay += "\nEntre 14h et 16h : " + hasSeizeHeures;
        messageToDisplay += "\nEntre 16h et 18h : " + hasDixHuitHeures;
        messageToDisplay += "\nAprès 18h : " + hasApresDixHuiHeures;

        messageToDisplay += "\n";

        messageToDisplay += "\nQuelle est la motivation initiale de votre venue dans les supermarchés ? : ";
        messageToDisplay += "\nCosmétiques/vestimentaires : " + hasCosVes;
        messageToDisplay += "\nBoissons gazeuses : " + hasBoisGaz;
        messageToDisplay += "\nCharcuterie/boulangerie/patisserie : " + hasChaBoPa;

        messageToDisplay += "\n";

        messageToDisplay += "\nA combien seriez-vous prêt à payer pour une boisson gazeuse Planet 1L dans les supermarchés ? : ";
        messageToDisplay += "\nMoins de 400 FCFA  : " + hasQuatreCents;
        messageToDisplay += "\nEntre 400 et 500 FCFA : " + hasCinqCents;
        messageToDisplay += "\nEntre 500 et 600 FCFA : " + hasSixCents;
        messageToDisplay += "\nPlus de 600 FCFA : " + hasPlusSixCents;

        messageToDisplay += "\n";

        messageToDisplay += "\nComment jugez-vous les produits Planet ? : ";
        messageToDisplay += "\nLes boissons gazeuses Planet sont de bonne qualité : " + nameTwelve;
        messageToDisplay += "\nLes boissons gazeuses Planet sont trop gazeuses : " + nameThirteen;
        messageToDisplay += "\nLes boissons gazeuses Planet sont très sucrées : " + nameFourteen;
        messageToDisplay += "\nLes boissons gazeuses Planet sont peu concentrées : " + nameFifteen;
        messageToDisplay += "\nLes boissons gazeuses Planet sont disponibles : " + nameSixteen;
        messageToDisplay += "\nLes boissons gazeuses Planet sont chères : " + nameSeveteen;
        messageToDisplay += "\nLes boissons gazeuses Planet sont variées : " + nameEighteen;

        messageToDisplay += "\n";

        messageToDisplay += "\nAvez-vous déjà été confronté à un problème lié à la consommation des boissons gazeuses Planet ? : ";
        messageToDisplay += "\nOui : " + hasYesProb;
        messageToDisplay += "\nNon : " + hasNoProb;
        messageToDisplay += "\nSi oui : " + nameFive;

        messageToDisplay += "\n";

        messageToDisplay += "\nCombien dépensez-vous par mois pour les boissons gazeuses ? : ";
        messageToDisplay += "\nMoins de 2000 FCFA : " + hasDeuxMilles;
        messageToDisplay += "\nEntre 2000 FCFA et 5000 FCFA : " + hasCinqMilles;
        messageToDisplay += "\nPlus de 5000 FCFA : " + hasPlusCinqMilles;

        messageToDisplay += "\n";

        messageToDisplay += "\nVos suggestions : " + nameSix;

        messageToDisplay += "\n";

        messageToDisplay += "\nThank you!";

        return messageToDisplay;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
