package com.shell.siep.gto.persistence.repository.maps;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.Database;
import com.shell.siep.gto.persistence.model.GTOAnalysisData;
import com.shell.siep.gto.persistence.repository.GTOAnalysisRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class GTOAnalysisRepositories {

    private final Map<String, Map<String, GTOAnalysisRepository<GTOAnalysisData>>> analysisRepositoryMap = new HashMap<>();

    public GTOAnalysisRepositories(Map<String, ? extends GTOAnalysisRepository<? extends GTOAnalysisData>> rockIsotopesRepositoryMap) {
        for(Map.Entry<String, ? extends GTOAnalysisRepository<? extends GTOAnalysisData>> entry : rockIsotopesRepositoryMap.entrySet()) {
            putInRepsitoryMap(entry);
        }
    }

    @Bean(name="AnalysisRepositories")
    public Map<String, Map<String, GTOAnalysisRepository<GTOAnalysisData>>> getAnalysisRepositories() {
        return analysisRepositoryMap;
    }

    private void putInRepsitoryMap(Map.Entry<String, ? extends GTOAnalysisRepository<? extends GTOAnalysisData>> entry) {
        for(Map.Entry<String, String> repoEntry : repositoryNames.entrySet()) {
            if(entry.getKey().endsWith(repoEntry.getValue())) {
                for (Database db : Database.values()) {
                    if (entry.getKey().toLowerCase().startsWith(db.getCode().toLowerCase())) {
                        if (!analysisRepositoryMap.containsKey(repoEntry.getKey())) {
                            analysisRepositoryMap.put(repoEntry.getKey(), new HashMap<>());
                        }
                        analysisRepositoryMap.get(repoEntry.getKey()).put(db.getCode(), (GTOAnalysisRepository<GTOAnalysisData>) entry.getValue());
                        break;
                    }
                }
            }
        }
    }

    private static final Map<String, String> repositoryNames = new HashMap<>();

    static {
        repositoryNames.put(AnalysisConstants.ISOTOPES_ROCK, "IsotopesRockRepository");
        repositoryNames.put(AnalysisConstants.PHYSICAL_PROPERTIES_DENSITY, "OilDensRepository");
        repositoryNames.put(AnalysisConstants.ISOTOPES_OIL_FRACTIONS, "IsotopesOilRepository");
        repositoryNames.put(AnalysisConstants.GC_SATURATES, "GcSaturateRepository");
        repositoryNames.put(AnalysisConstants.GC_WHOLE_OIL, "GcWholeOilRepository");
        repositoryNames.put(AnalysisConstants.GC_C7_GASOLINE_RANGE, "GcGasolineRepository");
        repositoryNames.put(AnalysisConstants.GC_GAS_COMPOSITION, "GcGasCompositionRepository");
        repositoryNames.put(AnalysisConstants.GCMS_BIOMARKERS_AROMATIC, "MsAromaticRepository");
        repositoryNames.put(AnalysisConstants.GCMS_BIOMARKERS_SATURATE, "MsSaturateRepository");
        repositoryNames.put(AnalysisConstants.ISOTOPES_COMPOUNT_SPECIFIC, "IsotopesGasRepository");
        repositoryNames.put(AnalysisConstants.PHYSICAL_PROPERTIES_VISCOSITY, "OilViscRepository");
        repositoryNames.put(AnalysisConstants.PHYSICAL_PROPERTIES_POURPOINT, "OilPourpointRepository");
        repositoryNames.put(AnalysisConstants.PHYSICAL_PROPERTIES_CLOUD_POINT, "OilCloudpointRepository");
        repositoryNames.put(AnalysisConstants.ELEMENTAL_NICKEL_VANADIUM, "OilNivRepository");
        repositoryNames.put(AnalysisConstants.ELEMENTAL_SULFUR, "OilSulfRepository");
        repositoryNames.put(AnalysisConstants.OIL_WATER_CONTENT, "OilWaterRepository");
        repositoryNames.put(AnalysisConstants.OIL_CONTAMINATION, "OilCntRepository");
        repositoryNames.put(AnalysisConstants.OIL_WAX_CONTENT, "OilWaxRepository");
        repositoryNames.put(AnalysisConstants.ROCK_PYROLYSIS, "RockPyroRepository");
        repositoryNames.put(AnalysisConstants.ROCK_TOC, "RockTocRepository");
        repositoryNames.put(AnalysisConstants.ROCK_VITRINITE_REFLECTION, "VrHeaderRepository");
        repositoryNames.put(AnalysisConstants.CHROMATOGRAMS, "ChromdataBlobRepository");
        repositoryNames.put(AnalysisConstants.GC_AROMATICS, "GCAromaticRepository");
        repositoryNames.put(AnalysisConstants.GC_HTGC, "GCHtgcRepository");
        repositoryNames.put(AnalysisConstants.MPLC, "MplcRepository");
        repositoryNames.put(AnalysisConstants.GC_HEADSPACE, "GcHeadspaceRepository");
        repositoryNames.put(AnalysisConstants.GC_SIMDIS, "GcSimdisRepository");
        repositoryNames.put(AnalysisConstants.GC_SIMDIS_HT, "GcSimdisHTRepository");
        repositoryNames.put(AnalysisConstants.GC_GC, "GCGCRepository");
        repositoryNames.put(AnalysisConstants.GC_TEGC, "GcTegcRepository");
        repositoryNames.put(AnalysisConstants.GC_MDGC, "GcMdgcRepository");
        repositoryNames.put(AnalysisConstants.GC_XMDGC_NAPH, "GcXmdgcNaphRepository");
        repositoryNames.put(AnalysisConstants.GC_XMDGC_BENZ, "GcXmdgcBenzRepository");
        repositoryNames.put(AnalysisConstants.GCMS_BIOMARKERS_MSMS, "MsMsRepository");
        repositoryNames.put(AnalysisConstants.MS_ALKYLBENZ, "MsAlkylbenzenesRepository");
        repositoryNames.put(AnalysisConstants.GC_MSMS_AREA, "GcMsmsAreaRepository");
        repositoryNames.put(AnalysisConstants.GC_GC_MS, "GcGcMsRepository");
        repositoryNames.put(AnalysisConstants.GCXGC, "GcGcMsRepository");
        repositoryNames.put(AnalysisConstants.CSIA_C7, "CsiaC7Repository");
        repositoryNames.put(AnalysisConstants.ISOTOPES_WATER, "IsotopesWaterRepository");
        repositoryNames.put(AnalysisConstants.GROSS_COMPOSITION_SARA, "OilSaraRepository");
        repositoryNames.put(AnalysisConstants.GROSS_COMPOSITION_OTHER, "OilGrossRepository");
        repositoryNames.put(AnalysisConstants.ELEMENTAL_CHNOS, "ChnosRepository");
        repositoryNames.put(AnalysisConstants.ELEMENTAL_NITROGEN, "OilNitrogenRepository");
        repositoryNames.put(AnalysisConstants.ELEMENTAL_INORGANIC, "OilInorganicRepository");
        repositoryNames.put(AnalysisConstants.OIL_TAN, "OilTanRepository");
        repositoryNames.put(AnalysisConstants.OIL_BASE, "OilBaseRepository");
        repositoryNames.put(AnalysisConstants.ROCK_EXTRACTION, "RockExtrRepository");
        repositoryNames.put(AnalysisConstants.ROCK_ROC, "RockRocRepository");
        repositoryNames.put(AnalysisConstants.ROCK_CHEMO, "RockChemostratRepository");
        repositoryNames.put(AnalysisConstants.WAX_DEPOSITION, "WaxDepositionRepository");
        repositoryNames.put(AnalysisConstants.WATER_BTEX, "LiqBtexRepository");
        repositoryNames.put(AnalysisConstants.PHYSICAL_PROPERTIES_BTEX, "LiqBtexRepository");
        repositoryNames.put(AnalysisConstants.WATER_ANALYSIS_CONDUCTIVITY, "LiqConResRepository");
        repositoryNames.put(AnalysisConstants.WATER_ANALYSIS_ALKALINITY, "LiqAlkalinityRepository");
        repositoryNames.put(AnalysisConstants.PISTON_CORE, "PistonCoreRepository");
        repositoryNames.put(AnalysisConstants.PFID, "PfidHeaderRepository");
        repositoryNames.put(AnalysisConstants.ROCK_MACERALS_V2, "RockMaceralsV2Repository");
        repositoryNames.put(AnalysisConstants.ROCK_MACERALS, "RockMaceralsRepository");
        repositoryNames.put(AnalysisConstants.WATER_ANALYSIS_DENSITY, "LiqDensRepository");
        repositoryNames.put(AnalysisConstants.WATER_ANALYSIS_DISSOLVED_GASES, "LiqDissolvedGasRepository");
        repositoryNames.put(AnalysisConstants.WATER_ANALYSIS_ELEMENTAL, "LiqElementalRepository");
        repositoryNames.put(AnalysisConstants.NPD, "LiqNpdRepository");
        repositoryNames.put(AnalysisConstants.WATER_ANALYSIS_OIL_IN_WATER, "LiqOilinwaterRepository");
        repositoryNames.put(AnalysisConstants.WATER_ANALYSIS_ORGANIC_ACIDS, "LiqOrganicacidsRepository");
        repositoryNames.put(AnalysisConstants.WATER_ANALYSIS_PAH, "LiqPahRepository");
        repositoryNames.put(AnalysisConstants.WATER_ANALYSIS_PH, "LiqPhRepository");
        repositoryNames.put(AnalysisConstants.WATER_ANALYSIS_SOLIDS, "LiqTdsRepository");
        repositoryNames.put(AnalysisConstants.ASPHALTENE_DISPERSION, "MeasAdtRepository");
        repositoryNames.put(AnalysisConstants.SARA, "OilSaraRepository");
        repositoryNames.put(AnalysisConstants.WATER_ANALYSIS, "OilInorganicRepository");
        repositoryNames.put(AnalysisConstants.PHYSICAL_PROPERTIES_WAX_CONTENT, "OilWaxRepository");
        repositoryNames.put(AnalysisConstants.PHYSICAL_PROPERTIES_WATER_CONTENT, "OilWaterRepository");
        repositoryNames.put(AnalysisConstants.PHYSICAL_PROPERTIES_TOG, "MeasTogRepository");
        repositoryNames.put(AnalysisConstants.PHYSICAL_PROPERTIES_TDS, "LiqTdsRepository");
        repositoryNames.put(AnalysisConstants.PHYSICAL_PROPERTIES_BASE, "OilBaseRepository");
        repositoryNames.put(AnalysisConstants.PHYSICAL_PROPERTIES_ACID, "OilTanRepository");
        repositoryNames.put(AnalysisConstants.PHYSICAL_PROPERTIES_TENSION, "MeasTensionRepository");
        repositoryNames.put(AnalysisConstants.PHYSICAL_PROPERTIES_PVALUE, "MeasPvalueRepository");
        repositoryNames.put(AnalysisConstants.PHYSICAL_PROPERTIES_PH, "LiqPhRepository");
        repositoryNames.put(AnalysisConstants.ISOTOPES, "IsotopesOilRepository");
        repositoryNames.put(AnalysisConstants.PHYSICAL_PROPERTIES_CONTAMINANT, "OilCntRepository");
        repositoryNames.put(AnalysisConstants.PIGI_BASE_INFO, "PigiBaseInfoRepository");
        repositoryNames.put(AnalysisConstants.PIGI_PYROYSIS, "PigiPyrolysisRepository");
        repositoryNames.put(AnalysisConstants.PIGI_MATURITY, "PigiMaturityRepository");
        repositoryNames.put(AnalysisConstants.PIGI_HYDROCARBONS, "PigiHydrocarbonsRepository");
        repositoryNames.put(AnalysisConstants.PIGI_STERANES, "PigiSteranesRepository");
        repositoryNames.put(AnalysisConstants.PIGI_TERPANES, "PigiTerpanesRepository");
        repositoryNames.put(AnalysisConstants.PIGI_ISOTOPE_PARAMETERS, "PigiIsotopeParametersRepository");
        repositoryNames.put(AnalysisConstants.PIGI_GASOLINES, "PigiGasolinesRepository");
        repositoryNames.put(AnalysisConstants.PIGI_AROMATICS, "PigiAromaticsRepository");
        repositoryNames.put(AnalysisConstants.PIGI_MONO_AROMATICS, "PigiMonoAromaticRepository");
        repositoryNames.put(AnalysisConstants.PIGI_GC_IRMS, "PigiGCIrmsRepository");
        repositoryNames.put(AnalysisConstants.PIGI_TRI_AROMATICS, "PigiTriAromaticRepository");
        repositoryNames.put(AnalysisConstants.PIGI_MISC_BIOMARKERS, "PigiMiscBiomarkersRepository");
        repositoryNames.put(AnalysisConstants.PIGI_EXTRACT, "ExtractRepository");
    }
}
